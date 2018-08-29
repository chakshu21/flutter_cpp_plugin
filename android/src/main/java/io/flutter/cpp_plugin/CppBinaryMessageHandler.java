package io.flutter.cpp_plugin;
import io.flutter.plugin.common.BinaryMessenger;

class CppBinaryMessageHandler extends BinaryMessenger.BinaryMessageHandler
{
    public CppBinaryMessageHandler(String channel)
    {
        mChannel=channel;
    }
    

    public void onMessage(ByteBuffer message, BinaryReply reply);
    {
        onMessageJni(message,reply);
    }
    
    public native void onMessageJni(ByteBuffer message,BinaryReply reply);
    private final String mChannel;
}
