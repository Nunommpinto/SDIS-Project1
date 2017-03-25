package FileSystem;

import java.util.HashMap;

public class File {
	private String id;
    private HashMap<Integer, Chunk> chunks;
    
    public File(String id) {
        this.id = id;
        this.chunks = new HashMap<>();
    }

    public void addChunk(Chunk chunk) {
        chunks.put(chunk.getChunk_nr(), chunk);
    }

    public Chunk getChunk(int chunkNo) {
        return chunks.get(chunkNo);
    }

    public boolean hasChunk(int chunkNo) {
        return chunks.containsKey(chunkNo);
    }
}
