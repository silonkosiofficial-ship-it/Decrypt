.class public final synthetic Lp0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j;


# instance fields
.field public final synthetic a:D


# direct methods
.method public synthetic constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lp0/r;->a:D

    return-void
.end method


# virtual methods
.method public final a(D)D
    .locals 2

    iget-wide v0, p0, Lp0/r;->a:D

    invoke-static {v0, v1, p1, p2}, Lp0/x;->s(DD)D

    move-result-wide p1

    return-wide p1
.end method
