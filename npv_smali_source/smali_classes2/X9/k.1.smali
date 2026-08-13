.class public abstract LX9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/k$a;
    }
.end annotation


# static fields
.field public static final a:LX9/k$a;

.field public static final b:LX9/k;

.field public static final c:LX9/Q;

.field public static final d:LX9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    new-instance v0, LX9/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX9/k$a;-><init>(Ly7/k;)V

    sput-object v0, LX9/k;->a:LX9/k$a;

    :try_start_0
    const-string v0, "java.nio.file.Files"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    new-instance v0, LX9/J;

    invoke-direct {v0}, LX9/J;-><init>()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, LX9/s;

    invoke-direct {v0}, LX9/s;-><init>()V

    :goto_0
    sput-object v0, LX9/k;->b:LX9/k;

    sget-object v0, LX9/Q;->D:LX9/Q$a;

    const-string v2, "java.io.tmpdir"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getProperty(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4, v1}, LX9/Q$a;->e(LX9/Q$a;Ljava/lang/String;ZILjava/lang/Object;)LX9/Q;

    move-result-object v0

    sput-object v0, LX9/k;->c:LX9/Q;

    new-instance v0, LY9/h;

    const-class v1, LY9/h;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v1, "getClassLoader(...)"

    invoke-static {v2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LY9/h;-><init>(Ljava/lang/ClassLoader;ZLX9/k;ILy7/k;)V

    sput-object v0, LX9/k;->d:LX9/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LX9/Q;LX9/Q;)V
.end method

.method public final b(LX9/Q;Z)V
    .locals 1

    const-string v0, "dir"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LY9/c;->a(LX9/k;LX9/Q;Z)V

    return-void
.end method

.method public final c(LX9/Q;)V
    .locals 1

    const-string v0, "dir"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LX9/k;->d(LX9/Q;Z)V

    return-void
.end method

.method public abstract d(LX9/Q;Z)V
.end method

.method public final e(LX9/Q;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LX9/k;->f(LX9/Q;Z)V

    return-void
.end method

.method public abstract f(LX9/Q;Z)V
.end method

.method public final g(LX9/Q;)Z
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LY9/c;->b(LX9/k;LX9/Q;)Z

    move-result p1

    return p1
.end method

.method public abstract h(LX9/Q;)LX9/j;
.end method

.method public abstract i(LX9/Q;)LX9/i;
.end method

.method public final j(LX9/Q;)LX9/i;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, LX9/k;->k(LX9/Q;ZZ)LX9/i;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(LX9/Q;ZZ)LX9/i;
.end method

.method public abstract l(LX9/Q;)LX9/Z;
.end method
