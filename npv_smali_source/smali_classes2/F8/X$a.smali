.class public final LF8/X$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LF8/X$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/X$a;

    invoke-direct {v0}, LF8/X$a;-><init>()V

    sput-object v0, LF8/X$a;->a:LF8/X$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LF8/n0;LF8/E;LF8/E;LO7/f0;)V
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "unsubstitutedArgument"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "argument"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "typeParameter"

    invoke-static {p4, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(LP7/c;)V
    .locals 1

    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(LO7/e0;LO7/f0;LF8/E;)V
    .locals 0

    const-string p2, "typeAlias"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "substitutedArgument"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public d(LO7/e0;)V
    .locals 1

    const-string v0, "typeAlias"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
