.class final Lr/a$a;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic C:Lr/a;


# direct methods
.method constructor <init>(Lr/a;)V
    .locals 0

    iput-object p1, p0, Lr/a$a;->C:Lr/a;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lr/a$d;

    iget-object v1, p0, Lr/a$a;->C:Lr/a;

    invoke-direct {v0, v1}, Lr/a$d;-><init>(Lr/a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lr/a$a;->C:Lr/a;

    invoke-virtual {v0}, Lr/Y;->size()I

    move-result v0

    return v0
.end method
