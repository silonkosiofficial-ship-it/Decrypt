.class public final Laa/e$b;
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
    name = "b"
.end annotation


# instance fields
.field private final a:Lt0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lt0/b;)V
    .locals 1

    const-string v0, "painter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/e$b;->a:Lt0/b;

    return-void
.end method


# virtual methods
.method public final a()Lt0/b;
    .locals 1

    iget-object v0, p0, Laa/e$b;->a:Lt0/b;

    return-object v0
.end method
