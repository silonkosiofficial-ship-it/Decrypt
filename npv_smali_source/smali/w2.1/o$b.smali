.class public final Lw2/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lw2/o$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/b;Ljava/lang/String;)Lw2/o;
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tableName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lw2/m;->g(Ly2/b;Ljava/lang/String;)Lw2/o;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lz2/d;Ljava/lang/String;)Lw2/o;
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tableName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr2/a;

    invoke-direct {v0, p1}, Lr2/a;-><init>(Lz2/d;)V

    invoke-virtual {p0, v0, p2}, Lw2/o$b;->a(Ly2/b;Ljava/lang/String;)Lw2/o;

    move-result-object p1

    return-object p1
.end method
