package FajarJmartPK;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

public class JsonTable<T> extends Vector{
    public final String filepath;
    private static final Gson gson = new Gson();

    public JsonTable(Class<T> clazz, String filepath) throws IOException{
        this.filepath = filepath;
    }

    public static <T> T readJson (Class<T> clazz, String filepath) throws FileNotFoundException{
        final JsonReader read = new JsonReader(new FileReader(filepath));
        return gson.fromJson(read, clazz);
    }
    
    public void writeJson() throws IOException{
        writeJson(this, this.filepath);
    }

    public static void writeJson (Object object, String filepath) throws IOException{
        final FileWriter writer = new FileWriter(filepath);
        writer.write(gson.toJson(object));
        writer.close();
    }
}
