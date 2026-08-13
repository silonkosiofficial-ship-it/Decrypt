.class public final Lx9/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx9/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx9/G;->a(Ljava/lang/String;Lt9/b;)Lv9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt9/b;


# direct methods
.method constructor <init>(Lt9/b;)V
    .locals 0

    iput-object p1, p0, Lx9/G$a;->a:Lt9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unsupported"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lw9/h;)Ljava/lang/Object;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unsupported"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic c()[Lt9/b;
    .locals 1

    invoke-static {p0}, Lx9/D;->a(Lx9/E;)[Lt9/b;

    move-result-object v0

    return-object v0
.end method

.method public d()[Lt9/b;
    .locals 3

    iget-object v0, p0, Lx9/G$a;->a:Lt9/b;

    const/4 v1, 0x1

    new-array v1, v1, [Lt9/b;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    const-string p2, "encoder"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unsupported"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
