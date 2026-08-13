.class public final LD8/h$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/h$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lp8/r;

.field final synthetic E:Ljava/io/ByteArrayInputStream;

.field final synthetic F:LD8/h;


# direct methods
.method public constructor <init>(Lp8/r;Ljava/io/ByteArrayInputStream;LD8/h;)V
    .locals 0

    iput-object p1, p0, LD8/h$c$a;->D:Lp8/r;

    iput-object p2, p0, LD8/h$c$a;->E:Ljava/io/ByteArrayInputStream;

    iput-object p3, p0, LD8/h$c$a;->F:LD8/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lp8/p;
    .locals 3

    iget-object v0, p0, LD8/h$c$a;->D:Lp8/r;

    iget-object v1, p0, LD8/h$c$a;->E:Ljava/io/ByteArrayInputStream;

    iget-object v2, p0, LD8/h$c$a;->F:LD8/h;

    invoke-virtual {v2}, LD8/h;->p()LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->c()LB8/k;

    move-result-object v2

    invoke-virtual {v2}, LB8/k;->k()Lp8/g;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lp8/r;->b(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp8/p;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/h$c$a;->a()Lp8/p;

    move-result-object v0

    return-object v0
.end method
