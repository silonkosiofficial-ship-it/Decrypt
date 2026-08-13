.class public final synthetic LK/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ljava/util/function/IntConsumer;

.field public final synthetic D:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/IntConsumer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/b;->C:Ljava/util/function/IntConsumer;

    iput p2, p0, LK/b;->D:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LK/b;->C:Ljava/util/function/IntConsumer;

    iget v1, p0, LK/b;->D:I

    invoke-static {v0, v1}, LK/c;->a(Ljava/util/function/IntConsumer;I)V

    return-void
.end method
