.class public final LQ7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LQ7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ7/c$a;

    invoke-direct {v0}, LQ7/c$a;-><init>()V

    sput-object v0, LQ7/c$a;->a:LQ7/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LO7/e;LO7/Z;)Z
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "functionDescriptor"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
