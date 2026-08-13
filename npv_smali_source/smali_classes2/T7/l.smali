.class public final LT7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT7/l$a;
    }
.end annotation


# static fields
.field public static final a:LT7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT7/l;

    invoke-direct {v0}, LT7/l;-><init>()V

    sput-object v0, LT7/l;->a:LT7/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/l;)Ld8/a;
    .locals 1

    const-string v0, "javaElement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LT7/l$a;

    check-cast p1, LU7/p;

    invoke-direct {v0, p1}, LT7/l$a;-><init>(LU7/p;)V

    return-object v0
.end method
