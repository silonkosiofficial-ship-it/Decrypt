.class public abstract LX1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX1/a$a;
    }
.end annotation


# static fields
.field private static final a:LX1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/a$a;-><init>(Ly7/k;)V

    sput-object v0, LX1/a;->a:LX1/a$a;

    const-string v0, "androidx.graphics.path"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method
