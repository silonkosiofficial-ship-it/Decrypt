.class final LP3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lk4/l;

.field final synthetic D:LP3/y;


# direct methods
.method constructor <init>(LP3/y;Lk4/l;)V
    .locals 0

    iput-object p1, p0, LP3/w;->D:LP3/y;

    iput-object p2, p0, LP3/w;->C:Lk4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LP3/w;->D:LP3/y;

    iget-object v1, p0, LP3/w;->C:Lk4/l;

    invoke-static {v0, v1}, LP3/y;->T2(LP3/y;Lk4/l;)V

    return-void
.end method
