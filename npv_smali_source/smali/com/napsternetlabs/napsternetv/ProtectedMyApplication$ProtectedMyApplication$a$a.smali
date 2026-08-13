.class public Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/io/File;

.field public static b:Z

.field public static c:Ljava/lang/String;

.field public static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->b:Z

    const-string v0, "alice"

    sput-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->c:Ljava/lang/String;

    const/16 v0, 0xb

    sput v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    sget v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->d:I

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-static {v0, v1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->b(ILjava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    array-length v2, v1

    if-le v2, v3, :cond_0

    aget-object v1, v1, v3

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    const-string v0, ""

    invoke-static {p0, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->b:Z

    if-nez v0, :cond_1

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->a:Ljava/io/File;

    invoke-static {p0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->a(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private static a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/String;

    const-string v0, "\\d+([ a-fA-F0-9]*)?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a([BJ)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->a([BJ)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v5

    if-nez v5, :cond_1

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    :goto_0
    return v1

    :cond_1
    :try_start_1
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result v0

    const/16 v3, 0xc8

    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    :goto_1
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move v1, v0

    :cond_2
    :goto_2
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1

    :catch_0
    move-exception v2

    :goto_3
    if-eqz v0, :cond_2

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catchall_0
    move-exception v2

    move-object v3, v2

    move-object v4, v0

    :goto_4
    if-eqz v4, :cond_4

    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_4
    :goto_5
    :try_start_6
    throw v3
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catch_2
    move-exception v0

    move-object v0, v5

    :goto_6
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v5, v0

    :goto_7
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    throw v1

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_7

    :catch_5
    move-exception v2

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v3, v0

    move-object v4, v2

    goto :goto_4

    :catch_6
    move-exception v0

    move-object v0, v2

    goto :goto_3
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->b(Landroid/content/Context;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$a$a;->b(Landroid/content/Context;)V

    return-void
.end method
