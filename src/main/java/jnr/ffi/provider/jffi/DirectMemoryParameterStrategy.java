package jnr.ffi.provider.jffi;

import jnr.ffi.Pointer;

/**
 *
 */
final class DirectMemoryParameterStrategy extends AbstractDirectPointerParameterStrategy {
    static final PointerParameterStrategy INSTANCE = new DirectMemoryParameterStrategy();

    @Override
    public final long address(Object o) {
        return ((Pointer) o).address();
    }
}
