.class final Lb1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/d;


# instance fields
.field private final a:Li1/f;


# direct methods
.method public constructor <init>(Li1/f;)V
    .locals 1

    const-string v0, "containerObject"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/g;->a:Li1/f;

    return-void
.end method
