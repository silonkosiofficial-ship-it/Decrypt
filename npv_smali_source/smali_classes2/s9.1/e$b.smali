.class public final Ls9/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls9/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo9/k;I)B
    .locals 1

    const-string v0, "segment"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lo9/k;->k(I)B

    move-result p1

    return p1
.end method
