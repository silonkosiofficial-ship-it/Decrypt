.class public final Lz/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/i;


# instance fields
.field private final a:Lz/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/h;->a:Lz/g;

    return-void
.end method


# virtual methods
.method public final a()Lz/g;
    .locals 1

    iget-object v0, p0, Lz/h;->a:Lz/g;

    return-object v0
.end method
