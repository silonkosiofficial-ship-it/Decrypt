.class public final synthetic Lf4/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf4/P;


# direct methods
.method public synthetic constructor <init>(Lf4/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/M;->C:Lf4/P;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf4/M;->C:Lf4/P;

    invoke-virtual {v0}, Lf4/P;->c()V

    return-void
.end method
