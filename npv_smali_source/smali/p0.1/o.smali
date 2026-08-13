.class public final synthetic Lp0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j;


# instance fields
.field public final synthetic a:Lp0/x;


# direct methods
.method public synthetic constructor <init>(Lp0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/o;->a:Lp0/x;

    return-void
.end method


# virtual methods
.method public final a(D)D
    .locals 1

    iget-object v0, p0, Lp0/o;->a:Lp0/x;

    invoke-static {v0, p1, p2}, Lp0/x;->l(Lp0/x;D)D

    move-result-wide p1

    return-wide p1
.end method
