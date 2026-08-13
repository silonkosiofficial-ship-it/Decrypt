.class public final synthetic Lf3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf3/v;


# direct methods
.method public synthetic constructor <init>(Lf3/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/t;->C:Lf3/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf3/t;->C:Lf3/v;

    invoke-static {v0}, Lf3/v;->b(Lf3/v;)V

    return-void
.end method
