package com.FajarJmartPK;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Vector;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

/**
 * FajarJmartPK
 *
 *
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 1 - 2021
 *
 */

public class JsonTable<T> extends Vector<T>
{
    private static final Gson gson = new Gson();
    public final String filepath;

    /**
     *
     * @param clazz is variable to Class<T>
     * @param filepath for Json table
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public JsonTable(Class<T> clazz, String filepath) throws IOException
    {
        this.filepath = filepath;
        try
        {
            Class<T[]> arrayType = (Class<T[]>) Array.newInstance(clazz, 0).getClass();
            T[] loaded = readJson(arrayType, filepath);
            if (loaded != null)
                Collections.addAll(this, loaded);
        }
        catch (FileNotFoundException e) {}
    }

    /**
     *
     * @throws IOException
     */
    //write Json
    public void writeJson() throws IOException
    {
        writeJson(this, this.filepath);
    }

    /**
     *
     * @param object is variable of Object
     * @param filepath of Json
     * @throws IOException
     */
    //2nd step write Json with known filepath
    public static void writeJson(Object object, String filepath) throws IOException
    {
        File file = new File(filepath);
        //check if file exist or not. Create new file if it doesn't exist.
        if (!file.exists())
        {
            File parent = file.getParentFile();
            if (parent != null)
                parent.mkdirs();
            file.createNewFile();
        }
        final FileWriter writer = new FileWriter(filepath);
        writer.write(gson.toJson(object));
        writer.close();
    }

    /**
     *
     * @param clazz is variable to Class<T>
     * @param filepath of Json
     * @param <T> a generic
     * @return
     * @throws FileNotFoundException
     */
    //read Json
    public static <T> T readJson(Class<T> clazz, String filepath) throws FileNotFoundException
    {
        final JsonReader reader = new JsonReader(new FileReader(filepath));
        return gson.fromJson(reader, clazz);
    }
}
