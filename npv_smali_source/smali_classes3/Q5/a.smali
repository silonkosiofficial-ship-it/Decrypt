.class public final LQ5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ5/a$a;
    }
.end annotation


# static fields
.field public static final a:LA5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ5/a;

    invoke-direct {v0}, LQ5/a;-><init>()V

    sput-object v0, LQ5/a;->a:LA5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LA5/b;)V
    .locals 2

    sget-object v0, LQ5/a$a;->a:LQ5/a$a;

    const-class v1, LQ5/d;

    invoke-interface {p1, v1, v0}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    const-class v1, LQ5/b;

    invoke-interface {p1, v1, v0}, LA5/b;->a(Ljava/lang/Class;Lz5/d;)LA5/b;

    return-void
.end method
