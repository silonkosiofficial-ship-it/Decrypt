.class public final Lz/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lz/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/n$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/n$a;->a:Lz/n$b;

    return-void
.end method


# virtual methods
.method public final a()Lz/n$b;
    .locals 1

    iget-object v0, p0, Lz/n$a;->a:Lz/n$b;

    return-object v0
.end method
