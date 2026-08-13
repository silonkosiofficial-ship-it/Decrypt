.class public final LR7/A$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR7/A;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LR7/A$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR7/A$b;

    invoke-direct {v0}, LR7/A$b;-><init>()V

    sput-object v0, LR7/A$b;->b:LR7/A$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LR7/x;Ln8/c;LE8/n;)LO7/P;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR7/r;

    invoke-direct {v0, p1, p2, p3}, LR7/r;-><init>(LR7/x;Ln8/c;LE8/n;)V

    return-object v0
.end method
