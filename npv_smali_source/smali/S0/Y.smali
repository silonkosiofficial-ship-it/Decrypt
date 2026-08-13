.class public final synthetic LS0/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LS0/Z;


# direct methods
.method public synthetic constructor <init>(LS0/Z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/Y;->C:LS0/Z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LS0/Y;->C:LS0/Z;

    invoke-static {v0}, LS0/Z;->i(LS0/Z;)V

    return-void
.end method
