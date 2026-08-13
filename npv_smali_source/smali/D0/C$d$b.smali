.class public final LD0/C$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/C$d;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:LD0/K;

.field final synthetic b:LD0/C;

.field final synthetic c:I

.field final synthetic d:LD0/K;


# direct methods
.method public constructor <init>(LD0/K;LD0/C;ILD0/K;)V
    .locals 0

    iput-object p2, p0, LD0/C$d$b;->b:LD0/C;

    iput p3, p0, LD0/C$d$b;->c:I

    iput-object p4, p0, LD0/C$d$b;->d:LD0/K;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/C$d$b;->a:LD0/K;

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LD0/C$d$b;->a:LD0/K;

    invoke-interface {v0}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LD0/C$d$b;->a:LD0/K;

    invoke-interface {v0}, LD0/K;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LD0/C$d$b;->a:LD0/K;

    invoke-interface {v0}, LD0/K;->getWidth()I

    move-result v0

    return v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, LD0/C$d$b;->b:LD0/C;

    iget v1, p0, LD0/C$d$b;->c:I

    invoke-static {v0, v1}, LD0/C;->q(LD0/C;I)V

    iget-object v0, p0, LD0/C$d$b;->d:LD0/K;

    invoke-interface {v0}, LD0/K;->k()V

    iget-object v0, p0, LD0/C$d$b;->b:LD0/C;

    invoke-static {v0}, LD0/C;->b(LD0/C;)I

    move-result v1

    invoke-virtual {v0, v1}, LD0/C;->x(I)V

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LD0/C$d$b;->a:LD0/K;

    invoke-interface {v0}, LD0/K;->l()Lx7/l;

    move-result-object v0

    return-object v0
.end method
