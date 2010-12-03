// File generated by hadoop record compiler. Do not edit.
package org.apache.zookeeper.proto;

import java.util.*;
import org.apache.jute.*;
public class JoinRequest implements Record {
  private String host;
  private int port;
  private int election_port;
  public JoinRequest() {
  }
  public JoinRequest(
        String host,
        int port,
        int election_port) {
    this.host=host;
    this.port=port;
    this.election_port=election_port;
  }
  public String getHost() {
    return host;
  }
  public void setHost(String m_) {
    host=m_;
  }
  public int getPort() {
    return port;
  }
  public void setPort(int m_) {
    port=m_;
  }
  public int getElectionPort() {
    return election_port;
  }
  public void setElectionPort(int m_) {
    election_port=m_;
  }  
  public void serialize(OutputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(this,tag);
    a_.writeString(host,"host");
    a_.writeInt(port,"port");
    a_.writeInt(election_port,"election_port");
    a_.endRecord(this,tag);
  }
  public void deserialize(InputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(tag);
    host=a_.readString("host");
    port=a_.readInt("port");
    election_port=a_.readInt("election_port");
    a_.endRecord(tag);
}
  public String toString() {
    try {
      java.io.ByteArrayOutputStream s =
        new java.io.ByteArrayOutputStream();
      CsvOutputArchive a_ = 
        new CsvOutputArchive(s);
      a_.startRecord(this,"");
    a_.writeString(host,"host");
    a_.writeInt(port,"port");
    a_.writeInt(election_port,"election_port");
      a_.endRecord(this,"");
      return new String(s.toByteArray(), "UTF-8");
    } catch (Throwable ex) {
      ex.printStackTrace();
    }
    return "ERROR";
  }
  public void write(java.io.DataOutput out) throws java.io.IOException {
    BinaryOutputArchive archive = new BinaryOutputArchive(out);
    serialize(archive, "");
  }
  public void readFields(java.io.DataInput in) throws java.io.IOException {
    BinaryInputArchive archive = new BinaryInputArchive(in);
    deserialize(archive, "");
  }
  public int compareTo (Object peer_) throws ClassCastException {
    throw new UnsupportedOperationException("comparing JoinRequest is unimplemented");
  }
  public boolean equals(Object peer_) {
    if (!(peer_ instanceof JoinRequest)) {
      return false;
    }
    if (peer_ == this) {
      return true;
    }
    JoinRequest peer = (JoinRequest) peer_;
    boolean ret = false;
    ret = host.equals(peer.host);
    if (!ret) return ret;
    ret = (port==peer.port);
    if (!ret) return ret;
    ret = (election_port==peer.election_port);
    if (!ret) return ret;
     return ret;
  }
  public int hashCode() {
    int result = 17;
    int ret;
    ret = host.hashCode();
    result = 37*result + ret;
    ret = (int)port;
    result = 37*result + ret;
    ret = (int)election_port;
    result = 37*result + ret;
    return result;
  }
  public static String signature() {
    return "LJoinRequest(sii)";
  }
}
