.class public abstract LU9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU9/c$a;
    }
.end annotation


# static fields
.field public static final a:LU9/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU9/c$a;-><init>(Ly7/k;)V

    sput-object v0, LU9/c;->a:LU9/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
.end method
