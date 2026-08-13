.class public final LF0/T$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/T;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
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

.field final synthetic e:Lx7/l;

.field final synthetic f:LF0/T;


# direct methods
.method constructor <init>(IILjava/util/Map;Lx7/l;Lx7/l;LF0/T;)V
    .locals 0

    iput p1, p0, LF0/T$d;->a:I

    iput p2, p0, LF0/T$d;->b:I

    iput-object p3, p0, LF0/T$d;->c:Ljava/util/Map;

    iput-object p4, p0, LF0/T$d;->d:Lx7/l;

    iput-object p5, p0, LF0/T$d;->e:Lx7/l;

    iput-object p6, p0, LF0/T$d;->f:LF0/T;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LF0/T$d;->c:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, LF0/T$d;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LF0/T$d;->a:I

    return v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, LF0/T$d;->e:Lx7/l;

    iget-object v1, p0, LF0/T$d;->f:LF0/T;

    invoke-virtual {v1}, LF0/T;->s1()LD0/X$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LF0/T$d;->d:Lx7/l;

    return-object v0
.end method
