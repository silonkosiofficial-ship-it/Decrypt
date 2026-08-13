.class public final synthetic Lw3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/f;


# instance fields
.field public final synthetic a:Lw3/g;


# direct methods
.method public synthetic constructor <init>(Lw3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/d;->a:Lw3/g;

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/String;)Lw3/u;
    .locals 2

    new-instance v0, Lw3/e;

    iget-object v1, p0, Lw3/d;->a:Lw3/g;

    invoke-direct {v0, v1, p1}, Lw3/e;-><init>(Lw3/g;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    sget-object p1, Lw3/u;->C:Lw3/u;

    return-object p1
.end method
