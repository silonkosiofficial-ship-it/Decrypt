.class final LP8/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final C:Ljava/lang/Object;

.field private D:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP8/g$c;->C:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, LP8/g$c;->D:Z

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Void;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, LP8/g$c;->D:Z

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .prologue
    iget-boolean v0, p0, LP8/g$c;->D:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LP8/g$c;->D:Z

    iget-object v0, p0, LP8/g$c;->C:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    invoke-virtual {p0}, LP8/g$c;->b()Ljava/lang/Void;

    return-void
.end method
