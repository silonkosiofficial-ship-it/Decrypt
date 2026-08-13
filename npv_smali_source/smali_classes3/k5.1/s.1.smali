.class public final synthetic Lk5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk5/w;

.field public final synthetic D:Ls5/j;


# direct methods
.method public synthetic constructor <init>(Lk5/w;Ls5/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/s;->C:Lk5/w;

    iput-object p2, p0, Lk5/s;->D:Ls5/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk5/s;->C:Lk5/w;

    iget-object v1, p0, Lk5/s;->D:Ls5/j;

    invoke-static {v0, v1}, Lk5/w;->d(Lk5/w;Ls5/j;)V

    return-void
.end method
