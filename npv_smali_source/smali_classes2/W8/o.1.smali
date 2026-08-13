.class public abstract LW8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "RESUME_TOKEN"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LW8/o;->a:Lb9/D;

    return-void
.end method
