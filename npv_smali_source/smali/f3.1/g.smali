.class public final synthetic Lf3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf3/r;

.field public final synthetic D:LY2/p;

.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lf3/r;LY2/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/g;->C:Lf3/r;

    iput-object p2, p0, Lf3/g;->D:LY2/p;

    iput p3, p0, Lf3/g;->E:I

    iput-object p4, p0, Lf3/g;->F:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lf3/g;->C:Lf3/r;

    iget-object v1, p0, Lf3/g;->D:LY2/p;

    iget v2, p0, Lf3/g;->E:I

    iget-object v3, p0, Lf3/g;->F:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lf3/r;->i(Lf3/r;LY2/p;ILjava/lang/Runnable;)V

    return-void
.end method
