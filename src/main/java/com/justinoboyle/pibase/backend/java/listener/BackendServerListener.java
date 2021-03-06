package com.justinoboyle.pibase.backend.java.listener;

import com.justinoboyle.pibase.core.java.server.listener.ServerRequestListener;
import com.justinoboyle.pibase.core.java.server.packet.PacketIncoming;
import com.justinoboyle.pibase.core.java.server.packet.PacketOutgoing;
import com.justinoboyle.pibase.core.java.util.StatusCode;

public class BackendServerListener extends ServerRequestListener {

    @Override
    public PacketOutgoing listen(PacketIncoming incoming) {
        return new PacketOutgoing(StatusCode.NOT_IMPLEMENTED, "Not yet implemented.", false);
    }

}
