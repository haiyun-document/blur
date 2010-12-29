package com.nearinfinity.blur.thrift.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import com.nearinfinity.blur.thrift.commands.BlurSearchCommand;
import com.nearinfinity.blur.thrift.generated.BlurException;
import com.nearinfinity.blur.thrift.generated.FacetQuery;
import com.nearinfinity.blur.thrift.generated.FacetResult;
import com.nearinfinity.blur.thrift.generated.FetchResult;
import com.nearinfinity.blur.thrift.generated.Hits;
import com.nearinfinity.blur.thrift.generated.Schema;
import com.nearinfinity.blur.thrift.generated.SearchQuery;
import com.nearinfinity.blur.thrift.generated.SearchQueryStatus;
import com.nearinfinity.blur.thrift.generated.Selector;
import com.nearinfinity.blur.thrift.generated.TableDescriptor;
import com.nearinfinity.blur.thrift.generated.BlurSearch.Client;
import com.nearinfinity.blur.thrift.generated.BlurSearch.Iface;

public class BlurClientEmbedded extends BlurClient {
    
    private Map<String,Client> nodes = new HashMap<String,Client>();

    @Override
    public <T> T execute(String node, BlurSearchCommand<T> command) throws Exception {
        Client client = nodes.get(node);
        return command.call(client);
    }

    public Map<String, Client> getNodes() {
        return nodes;
    }

    public BlurClientEmbedded setNodes(Map<String, Client> nodes) {
        this.nodes = nodes;
        return this;
    }
    
    public BlurClientEmbedded putNode(String node, Client client) {
        nodes.put(node, client);
        return this;
    }
    
    public BlurClientEmbedded putNode(String node, Iface face) {
        return putNode(node, new EmbeddedClient(face));
    }
    
    public static class EmbeddedClient extends Client {

        private Iface face;

        public EmbeddedClient(Iface face) {
            super(null);
            this.face = face;
        }

        @Override
        public void cancelSearch(long uuid) throws BlurException, TException {
            face.cancelSearch(uuid);
        }

        @Override
        public List<String> controllerServerList() throws BlurException, TException {
            return face.controllerServerList();
        }

        @Override
        public List<SearchQueryStatus> currentSearches(String table) throws BlurException, TException {
            return face.currentSearches(table);
        }

        @Override
        public TableDescriptor describe(String table) throws BlurException, TException {
            return face.describe(table);
        }

        @Override
        public FacetResult facetSearch(String table, FacetQuery facetQuery) throws BlurException, TException {
            return face.facetSearch(table, facetQuery);
        }

        @Override
        public FetchResult fetchRow(String table, Selector selector) throws BlurException, TException {
            return face.fetchRow(table, selector);
        }

        @Override
        public byte[] fetchRowBinary(String table, Selector selector) throws BlurException, TException {
            return face.fetchRowBinary(table, selector);
        }

        @Override
        public long recordFrequency(String table, String columnFamily, String columnName, String value)
                throws BlurException, TException {
            return face.recordFrequency(table, columnFamily, columnName, value);
        }

        @Override
        public Schema schema(String table) throws BlurException, TException {
            return face.schema(table);
        }

        @Override
        public Hits search(String table, SearchQuery searchQuery) throws BlurException, TException {
            return face.search(table, searchQuery);
        }

        @Override
        public Map<String, String> shardServerLayout(String table) throws BlurException, TException {
            return face.shardServerLayout(table);
        }

        @Override
        public List<String> shardServerList() throws BlurException, TException {
            return face.shardServerList();
        }

        @Override
        public List<String> tableList() throws BlurException, TException {
            return face.tableList();
        }

        @Override
        public List<String> terms(String table, String columnFamily, String columnName, String startWith, short size)
                throws BlurException, TException {
            return face.terms(table, columnFamily, columnName, startWith, size);
        }

        @Override
        public TProtocol getInputProtocol() {
            throw new RuntimeException("not impl");
        }

        @Override
        public TProtocol getOutputProtocol() {
            throw new RuntimeException("not impl");
        }

        @Override
        public void recv_cancelSearch() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public List<String> recv_controllerServerList() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public List<SearchQueryStatus> recv_currentSearches() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public TableDescriptor recv_describe() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public FacetResult recv_facetSearch() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public FetchResult recv_fetchRow() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public byte[] recv_fetchRowBinary() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public long recv_recordFrequency() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public Schema recv_schema() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public Hits recv_search() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public Map<String, String> recv_shardServerLayout() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public List<String> recv_shardServerList() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public List<String> recv_tableList() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public List<String> recv_terms() throws BlurException, TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_cancelSearch(long uuid) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_controllerServerList() throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_currentSearches(String table) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_describe(String table) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_facetSearch(String table, FacetQuery facetQuery) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_fetchRow(String table, Selector selector) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_fetchRowBinary(String table, Selector selector) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_recordFrequency(String table, String columnFamily, String columnName, String value)
                throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_schema(String table) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_search(String table, SearchQuery searchQuery) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_shardServerLayout(String table) throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_shardServerList() throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_tableList() throws TException {
            throw new RuntimeException("not impl");
        }

        @Override
        public void send_terms(String table, String columnFamily, String columnName, String startWith, short size)
                throws TException {
            throw new RuntimeException("not impl");
        }
    }
}
