package test.fixtures.exceptions;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

@ThriftStruct("Fiery")
public final class Fiery extends Exception
{
    private static final long serialVersionUID = 1L;

    @ThriftConstructor
    public Fiery(
        @ThriftField(value=1, name="message", requiredness=Requiredness.REQUIRED) final String message
    ) {
        this.message = message;
    }

    public static class Builder {
        private String message;

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder() { }
        public Builder(Fiery other) {
            this.message = other.message;
        }

        public Fiery build() {
            return new Fiery (
                this.message
            );
        }
    }

    private final String message;

    @ThriftField(value=1, name="message", requiredness=Requiredness.REQUIRED)
    public String getMessage() { return message; }
}
