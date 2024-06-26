package gurux.dlms;

import java.util.Map;

/**
 * Java ME is not implementing SimpleEntry.
 */
public final class GXSimpleEntry<K, V> implements Map.Entry<K, V> {
    private final K key;
    private V value;

    /**
     * Constructor for Parameterized type public GXSimpleEntry(K key, V value)
     * 
     * @param forKey
     *            Key
     * @param forValue
     *            Value
     */
    public GXSimpleEntry(final K forKey, final V forValue) {
        this.key = forKey;
        this.value = forValue;
    }

    // @Override
    public K getKey() {
        return key;
    }

    // @Override
    public V getValue() {
        return value;
    }

    // @Override
    public V setValue(final V forValue) {
        V old = value;
        value = forValue;
        return old;
    }
}
