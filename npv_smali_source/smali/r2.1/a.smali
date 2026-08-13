.class public final Lr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/b;


# instance fields
.field private final a:Lz2/d;


# direct methods
.method public constructor <init>(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/a;->a:Lz2/d;

    return-void
.end method


# virtual methods
.method public final a()Lz2/d;
    .locals 1

    iget-object v0, p0, Lr2/a;->a:Lz2/d;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lr2/e;
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr2/e;->d:Lr2/e$a;

    iget-object v1, p0, Lr2/a;->a:Lz2/d;

    invoke-virtual {v0, v1, p1}, Lr2/e$a;->a(Lz2/d;Ljava/lang/String;)Lr2/e;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lr2/a;->a:Lz2/d;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/String;)Ly2/e;
    .locals 0

    invoke-virtual {p0, p1}, Lr2/a;->b(Ljava/lang/String;)Lr2/e;

    move-result-object p1

    return-object p1
.end method
