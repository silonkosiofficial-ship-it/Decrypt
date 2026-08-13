.class public final Laa/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laa/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lo0/E1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo0/E1;)V
    .locals 1

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/e$a;->a:Lo0/E1;

    return-void
.end method


# virtual methods
.method public final a()Lo0/E1;
    .locals 1

    iget-object v0, p0, Laa/e$a;->a:Lo0/E1;

    return-object v0
.end method
