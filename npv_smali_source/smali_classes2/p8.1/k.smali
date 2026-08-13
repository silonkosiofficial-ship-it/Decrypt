.class public Lp8/k;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field private C:Lp8/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lp8/k;->C:Lp8/p;

    return-void
.end method

.method static b()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static c()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static d()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static e()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static f()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static g()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static h()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static j()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static k()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Lp8/p;
    .locals 1

    iget-object v0, p0, Lp8/k;->C:Lp8/p;

    return-object v0
.end method

.method public i(Lp8/p;)Lp8/k;
    .locals 0

    iput-object p1, p0, Lp8/k;->C:Lp8/p;

    return-object p0
.end method
