.class public final LD0/C$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/C$c;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lx7/l;

.field final synthetic e:LD0/C$c;

.field final synthetic f:LD0/C;

.field final synthetic g:Lx7/l;


# direct methods
.method constructor <init>(IILjava/util/Map;Lx7/l;LD0/C$c;LD0/C;Lx7/l;)V
    .locals 0

    iput p1, p0, LD0/C$c$a;->a:I

    iput p2, p0, LD0/C$c$a;->b:I

    iput-object p3, p0, LD0/C$c$a;->c:Ljava/util/Map;

    iput-object p4, p0, LD0/C$c$a;->d:Lx7/l;

    iput-object p5, p0, LD0/C$c$a;->e:LD0/C$c;

    iput-object p6, p0, LD0/C$c$a;->f:LD0/C;

    iput-object p7, p0, LD0/C$c$a;->g:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LD0/C$c$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, LD0/C$c$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LD0/C$c$a;->a:I

    return v0
.end method

.method public k()V
    .locals 2

    .prologue
    iget-object v0, p0, LD0/C$c$a;->e:LD0/C$c;

    invoke-virtual {v0}, LD0/C$c;->A0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LD0/C$c$a;->f:LD0/C;

    invoke-static {v0}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LD0/C$c$a;->g:Lx7/l;

    invoke-virtual {v0}, LF0/T;->s1()LD0/X$a;

    move-result-object v0

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, p0, LD0/C$c$a;->g:Lx7/l;

    iget-object v1, p0, LD0/C$c$a;->f:LD0/C;

    invoke-static {v1}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->P()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/T;->s1()LD0/X$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LD0/C$c$a;->d:Lx7/l;

    return-object v0
.end method
