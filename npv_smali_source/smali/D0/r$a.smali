.class public final LD0/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/r;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
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


# direct methods
.method constructor <init>(IILjava/util/Map;Lx7/l;)V
    .locals 0

    iput p1, p0, LD0/r$a;->a:I

    iput p2, p0, LD0/r$a;->b:I

    iput-object p3, p0, LD0/r$a;->c:Ljava/util/Map;

    iput-object p4, p0, LD0/r$a;->d:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LD0/r$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, LD0/r$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LD0/r$a;->a:I

    return v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LD0/r$a;->d:Lx7/l;

    return-object v0
.end method
