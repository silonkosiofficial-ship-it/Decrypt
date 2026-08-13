.class public final Lx/C$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/C;-><init>(Lx/A;Lv/T;Lx/p;Lx/s;ZLy0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx/C;


# direct methods
.method constructor <init>(Lx/C;)V
    .locals 0

    iput-object p1, p0, Lx/C$c;->a:Lx/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JI)J
    .locals 2

    .prologue
    iget-object v0, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v0, p3}, Lx/C;->j(Lx/C;I)V

    iget-object v0, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v0}, Lx/C;->f(Lx/C;)Lv/T;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v1}, Lx/C;->h(Lx/C;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p3, p0, Lx/C$c;->a:Lx/C;

    invoke-static {p3}, Lx/C;->b(Lx/C;)I

    move-result p3

    iget-object v1, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v1}, Lx/C;->g(Lx/C;)Lx7/l;

    move-result-object v1

    invoke-interface {v0, p1, p2, p3, v1}, Lv/T;->a(JILx7/l;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v0}, Lx/C;->e(Lx/C;)Lx/w;

    move-result-object v0

    iget-object v1, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v1, v0, p1, p2, p3}, Lx/C;->i(Lx/C;Lx/w;JI)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    iget-object v0, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v0}, Lx/C;->e(Lx/C;)Lx/w;

    move-result-object v0

    iget-object v1, p0, Lx/C$c;->a:Lx/C;

    invoke-static {v1, v0, p1, p2, p3}, Lx/C;->i(Lx/C;Lx/w;JI)J

    move-result-wide p1

    return-wide p1
.end method
