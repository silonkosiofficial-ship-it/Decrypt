.class public final LX9/Q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LX9/Q$a;-><init>()V

    return-void
.end method

.method public static synthetic d(LX9/Q$a;Ljava/io/File;ZILjava/lang/Object;)LX9/Q;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LX9/Q$a;->a(Ljava/io/File;Z)LX9/Q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LX9/Q$a;Ljava/lang/String;ZILjava/lang/Object;)LX9/Q;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LX9/Q$a;->b(Ljava/lang/String;Z)LX9/Q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LX9/Q$a;Ljava/nio/file/Path;ZILjava/lang/Object;)LX9/Q;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LX9/Q$a;->c(Ljava/nio/file/Path;Z)LX9/Q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/io/File;Z)LX9/Q;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LX9/Q$a;->b(Ljava/lang/String;Z)LX9/Q;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Z)LX9/Q;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LY9/d;->k(Ljava/lang/String;Z)LX9/Q;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/nio/file/Path;Z)LX9/Q;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LX9/Q$a;->b(Ljava/lang/String;Z)LX9/Q;

    move-result-object p1

    return-object p1
.end method
