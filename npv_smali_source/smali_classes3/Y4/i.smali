.class public final synthetic LY4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LY4/k;


# direct methods
.method public synthetic constructor <init>(LY4/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY4/i;->C:LY4/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LY4/i;->C:LY4/k;

    invoke-static {v0}, LY4/k;->b(LY4/k;)V

    return-void
.end method
