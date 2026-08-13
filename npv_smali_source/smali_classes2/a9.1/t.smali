.class public abstract La9/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb9/D;

.field public static final b:Lb9/D;

.field public static final c:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, La9/t;->a:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, La9/t;->b:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "DONE"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, La9/t;->c:Lb9/D;

    return-void
.end method
