.class public final LD0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/d;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/Map;

.field private final d:Lx7/l;

.field final synthetic e:Lx7/l;

.field final synthetic f:LD0/d;


# direct methods
.method constructor <init>(IILjava/util/Map;Lx7/l;Lx7/l;LD0/d;)V
    .locals 0

    iput-object p5, p0, LD0/d$a;->e:Lx7/l;

    iput-object p6, p0, LD0/d$a;->f:LD0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LD0/d$a;->a:I

    iput p2, p0, LD0/d$a;->b:I

    iput-object p3, p0, LD0/d$a;->c:Ljava/util/Map;

    iput-object p4, p0, LD0/d$a;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LD0/d$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, LD0/d$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LD0/d$a;->a:I

    return v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, LD0/d$a;->e:Lx7/l;

    iget-object v1, p0, LD0/d$a;->f:LD0/d;

    invoke-virtual {v1}, LD0/d;->k()LF0/F;

    move-result-object v1

    invoke-virtual {v1}, LF0/T;->s1()LD0/X$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LD0/d$a;->d:Lx7/l;

    return-object v0
.end method
