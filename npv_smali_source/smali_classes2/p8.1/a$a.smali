.class public abstract Lp8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/a$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static j(Lp8/p;)Lp8/v;
    .locals 1

    new-instance v0, Lp8/v;

    invoke-direct {v0, p0}, Lp8/v;-><init>(Lp8/p;)V

    return-object v0
.end method
