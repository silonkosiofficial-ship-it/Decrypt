.class public abstract Lo2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/x$a;
    }
.end annotation


# static fields
.field public static final C:Lo2/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/x$a;-><init>(Ly7/k;)V

    sput-object v0, Lo2/x;->C:Lo2/x$a;

    return-void
.end method
