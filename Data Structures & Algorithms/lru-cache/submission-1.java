class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(16, 0.75f, true); 
    }

    public int get(int key) {
        return map.getOrDefault(key, -1); 
    }

    public void put(int key, int value) {
        map.put(key, value); 
        if (map.size() > capacity) {  
            Integer eldestKey = map.keySet().iterator().next();
            map.remove(eldestKey);
        }
    }
}
